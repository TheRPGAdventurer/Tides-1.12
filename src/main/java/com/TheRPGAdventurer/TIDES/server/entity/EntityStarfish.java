package com.TheRPGAdventurer.TIDES.server.entity;

import java.util.Random;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityStarfish extends EntityCreature {

	private static Random rand = new Random();
	private boolean hasNotSpawned = true;

	public EntityStarfish(World par1)
	{
		this(par1, rand.nextInt(7));
	}

	public EntityStarfish(World par1World, int par2) {
		super(par1World);
	//	this.setTexture(par2);
		this.ignoreFrustumCheck = true;
		this.setSize(this.getRenderSizeModifier(), 0.5F);
	}
	
	@Override
	protected void initEntityAI() {
//        this.getNavigator().setAvoidsWater(false);
        this.tasks.addTask(2, new EntityAIAvoidEntity(this, EntityPlayer.class, 6.0F, 0.1D, 0.1D));
		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 0.1D));
		this.tasks.addTask(6, new EntityAIWander(this, 0.1D));
		this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, false));
	}
	
	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}

	public boolean getHasNotSpawned() {
		return this.hasNotSpawned;
	}
	
	public void setHasNotSpawned(boolean par1) {
		this.hasNotSpawned = par1;
	}
	
	protected boolean isAIEnabled() {
		return true;

	}

	public int getTotalArmorValue()	{
		return 0;
	}
	
	@Override
	public boolean canBePushed() {	
		return false;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(45.0D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(10);

	}

	public EnumCreatureAttribute getCreatureAttribute()
	{
		return EnumCreatureAttribute.UNDEFINED;
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	@Override
	protected SoundEvent getHurtSound(DamageSource src) {
		return SoundEvents.ENTITY_PLAYER_ATTACK_WEAK;		
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	protected SoundEvent getLivingSound() {	
		return null;	
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	protected SoundEvent getDeathSound() {
		return null;
	}

	@Override
	protected void dropFewItems(boolean par1, int par2) {
		super.dropFewItems(par1, par2);

	}

	protected void fall(float var1) {}
	
    /**
     * Gets called every tick from main Entity class
     */
	@Override
    public void onEntityUpdate() {
        int i = this.getAir();
        super.onEntityUpdate();

        if (this.isEntityAlive() && !this.isInWater()) {
            --i;
            this.setAir(i);

            if (this.getAir() == -20) {
                this.setAir(0);
                this.attackEntityFrom(DamageSource.DROWN, 2.0F);
            }
        } else {
            this.setAir(300);
        }
    }


	/**
	 * Called when the mob's health reaches 0.
	 */
	@Override
	public void onDeath(DamageSource par1DamageSource) {
		super.onDeath(par1DamageSource);

	}
//	public void setTexture(int par1)
////	{
//		this.dataManager.register(19, Integer.valueOf(par1));
//	}
	
	

//	public int getTexture()
//	{
//		return this.dataManager.get(19);
//	}
	
	

	protected void entityInit()
	{
		super.entityInit();
//		this.dataWatcher.addObject(19, Integer.valueOf(0));
//		this.dataWatcher.addObject(21, Float.valueOf(0));
	}

	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeEntityToNBT(par1NBTTagCompound);
//		par1NBTTagCompound.setInteger("Texture", this.getTexture());
		par1NBTTagCompound.setBoolean("HasNotSpawned", this.getHasNotSpawned());
	}

	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readEntityFromNBT(par1NBTTagCompound);
//		this.setTexture(par1NBTTagCompound.getInteger("Texture"));
		this.setHasNotSpawned(par1NBTTagCompound.getBoolean("HasNotSpawned"));
	}

	
	/**
	 * randomly selected ChunkCoordinates in a 7x6x7 box around the bat (y
	 * offset -2 to 4) towards which it will fly. upon getting close a new
	 * target will be selected
	 */

	
	@Override
	protected void updateAITasks()
	{
		super.updateAITasks();
		if(this.isInWater())
		{
				
		}
			
		else
		{
				
		}
//		if(this.hasCustomNameTag() && this.getCustomNameTag().equals("Patrick") && this.getTexture() == 6)
	//	{
	//		EntityPatrick star = new EntityPatrick(this.worldObj);
	//		star.setLocationAndAngles(this.posX, this.posY, this.posZ, 0.0F, 0.0F);
	//		this.worldObj.spawnEntityInWorld(star);
	//		star.setCustomNameTag("Patrick");
	//		this.setDead();
	//	}
		
	}

	@Override
	public boolean canBeCollidedWith()
	{
		return true;
		
	}



	
	
/**	 public boolean interact(EntityPlayer par1EntityPlayer) {
		 	ItemStack item = par1EntityPlayer.inventory.getCurrentItem();
		 	if(item != null && item.getItem() == FantasticItems.fishingNet)
		 	{
		 		ItemStack starfish = new ItemStack(FantasticItems.starfish, 1);
		 		int damage = 5;
		 		
		 		starfish.setItemDamage(this.getTexture());
		 		if(this.hasCustomNameTag())
		 		{
			 		starfish.setStackDisplayName(this.getCustomNameTag());
		 		}
		 		EntityItem entityitem = new EntityItem(this.worldObj, this.posX, this.posY, this.posZ, starfish);
		 		if(!this.worldObj.isRemote)
		 		{
		 			this.worldObj.spawnEntityInWorld(entityitem);
		 		}
                if(!par1EntityPlayer.capabilities.isCreativeMode)
                {
                	item.damageItem(damage, par1EntityPlayer);
                }
                this.setDead();
		 		
		 	}
		 	else if(item != null && item.getItem() == Items.name_tag)
		 	{
		 		if(item.hasDisplayName())
		 		{
		 			this.setCustomNameTag(item.getDisplayName());
		 			item.stackSize--;
		 		}
		 	}
		 	
			return true;
	    }
	 /**
	     * Determines if an entity can be despawned, used on idle far away entities
	     */
	    protected boolean canDespawn()  {
	        return this.hasCustomName() ? false : true;
	    }

}
