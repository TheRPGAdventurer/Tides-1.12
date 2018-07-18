package com.TheRPGAdventurer.TIDES.client.render;

import org.lwjgl.opengl.GL11;

import com.TheRPGAdventurer.TIDES.Tides;
import com.TheRPGAdventurer.TIDES.client.model.ModelStarfish;
import com.TheRPGAdventurer.TIDES.server.entity.EntityStarfish;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderStarfish extends RenderLiving<EntityStarfish> {
	
	public static final ResourceLocation TEXTURES = new ResourceLocation(Tides.MODID, "textures/creatures/starfish.png");

	public RenderStarfish(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelStarfish(), 0);
		
	}
	
	public void renderStarfish(EntityStarfish par1, double par2, double par3, double par4, float par5, float par6) {
		super.doRender(par1, par2, par3, par4, par5, par6);
		
	}

	public void doRenderLiving(EntityLiving par1, double par2, double par3, double par4, float par5, float par6) {
		this.renderStarfish((EntityStarfish) par1, par2, par3, par4, par5, par6);
		
	}

	@Override
	public void doRender(EntityStarfish par1, double par2, double par3, double par4, float par5, float par6) {
		this.renderStarfish(par1, par2, par3, par4, par5, par6);
	}
	
    
    protected void scaleFish(EntityStarfish par1, float par2)  {    	
        GL11.glScaled(1.0, 1.0, 1.0);
        GL11.glTranslated(0.0, 1.38, 0.0);
    }
		

	@Override
	protected ResourceLocation getEntityTexture(EntityStarfish entity) {
		return TEXTURES;
	}
	
	@Override
	protected void preRenderCallback(EntityStarfish entitylivingbaseIn, float partialTickTime) {
		this.scaleFish((EntityStarfish)entitylivingbaseIn, partialTickTime);
	}

}
