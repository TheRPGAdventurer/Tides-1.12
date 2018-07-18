package com.TheRPGAdventurer.TIDES.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
 
public class ModelStarfish extends ModelBase {
  //fields
    ModelRenderer Arm11;
    ModelRenderer Arm12;
    ModelRenderer Arm13;
    
    ModelRenderer Arm21;
    ModelRenderer Arm22;
    ModelRenderer Arm23;
    
    ModelRenderer Arm31;
    ModelRenderer Arm32;
    ModelRenderer Arm33;
    
    ModelRenderer Arm41;
    ModelRenderer Arm42;
    ModelRenderer Arm43;

    ModelRenderer Arm51;
    ModelRenderer Arm52;
    ModelRenderer Arm53;
   
  public ModelStarfish() {
    textureWidth = 64;
    textureHeight = 32;
     
      Arm11 = new ModelRenderer(this, 0, 0);
      Arm11.addBox(-1F, -1F, 0F, 2, 2, 7);
      Arm11.setRotationPoint(0F, 0F, 0F);
      Arm11.setTextureSize(64, 32);
      Arm11.mirror = true;
      setRotation(Arm11, -0.1396263F, 0F, 0F);
      Arm13 = new ModelRenderer(this, 18, 0);
      Arm13.mirror = true;
      Arm13.addBox(-2F, -0.5F, 1F, 1, 1, 8);
      Arm13.setRotationPoint(0F, 0F, 0F);
      Arm13.setTextureSize(64, 32);
      Arm13.mirror = true;
      setRotation(Arm13, -0.0872665F, 0.1396263F, 0F);
      Arm13.mirror = false;
      Arm12 = new ModelRenderer(this, 18, 0);
      Arm12.addBox(1F, -0.5F, 1F, 1, 1, 8);
      Arm12.setRotationPoint(0F, 0F, 0F);
      Arm12.setTextureSize(64, 32);
      Arm12.mirror = true;
      setRotation(Arm12, -0.0872665F, -0.1396263F, 0F);
      Arm21 = new ModelRenderer(this, 0, 0);
      Arm21.addBox(-1F, -1F, 0F, 2, 2, 7);
      Arm21.setRotationPoint(0F, 0F, 0F);
      Arm21.setTextureSize(64, 32);
      Arm21.mirror = true;
      setRotation(Arm21, -0.1396263F, 1.32645F, 0F);
      Arm23 = new ModelRenderer(this, 18, 0);
      Arm23.mirror = true;
      Arm23.addBox(-2F, -0.5F, 1F, 1, 1, 8);
      Arm23.setRotationPoint(0F, 0F, 0F);
      Arm23.setTextureSize(64, 32);
      Arm23.mirror = true;
      setRotation(Arm23, -0.0872665F, 1.466077F, 0F);
      Arm23.mirror = false;
      Arm22 = new ModelRenderer(this, 18, 0);
      Arm22.addBox(1F, -0.5F, 1F, 1, 1, 8);
      Arm22.setRotationPoint(0F, 0F, 0F);
      Arm22.setTextureSize(64, 32);
      Arm22.mirror = true;
      setRotation(Arm22, -0.0872665F, 1.186824F, 0F);
      Arm31 = new ModelRenderer(this, 0, 0);
      Arm31.addBox(-1F, -1F, 0F, 2, 2, 7);
      Arm31.setRotationPoint(0F, 0F, 0F);
      Arm31.setTextureSize(64, 32);
      Arm31.mirror = true;
      setRotation(Arm31, -0.1396263F, 2.530727F, 0F);
      Arm33 = new ModelRenderer(this, 18, 0);
      Arm33.mirror = true;
      Arm33.addBox(-2F, -0.5F, 1F, 1, 1, 8);
      Arm33.setRotationPoint(0F, 0F, 0F);
      Arm33.setTextureSize(64, 32);
      Arm33.mirror = true;
      setRotation(Arm33, -0.0872665F, 2.670354F, 0F);
      Arm33.mirror = false;
      Arm32 = new ModelRenderer(this, 18, 0);
      Arm32.addBox(1F, -0.5F, 1F, 1, 1, 8);
      Arm32.setRotationPoint(0F, 0F, 0F);
      Arm32.setTextureSize(64, 32);
      Arm32.mirror = true;
      setRotation(Arm32, -0.0872665F, 2.391101F, 0F);
      Arm41 = new ModelRenderer(this, 0, 0);
      Arm41.addBox(-1F, -1F, 0F, 2, 2, 7);
      Arm41.setRotationPoint(0F, 0F, 0F);
      Arm41.setTextureSize(64, 32);
      Arm41.mirror = true;
      setRotation(Arm41, -0.1396263F, -2.530727F, 0F);
      Arm43 = new ModelRenderer(this, 18, 0);
      Arm43.mirror = true;
      Arm43.addBox(-2F, -0.5F, 1F, 1, 1, 8);
      Arm43.setRotationPoint(0F, 0F, 0F);
      Arm43.setTextureSize(64, 32);
      Arm43.mirror = true;
      setRotation(Arm43, -0.0872665F, -2.391101F, 0F);
      Arm43.mirror = false;
      Arm42 = new ModelRenderer(this, 18, 0);
      Arm42.addBox(1F, -0.5F, 1F, 1, 1, 8);
      Arm42.setRotationPoint(0F, 0F, 0F);
      Arm42.setTextureSize(64, 32);
      Arm42.mirror = true;
      setRotation(Arm42, -0.0872665F, -2.670354F, 0F);
      Arm51 = new ModelRenderer(this, 0, 0);
      Arm51.addBox(-1F, -1F, 0F, 2, 2, 7);
      Arm51.setRotationPoint(0F, 0F, 0F);
      Arm51.setTextureSize(64, 32);
      Arm51.mirror = true;
      setRotation(Arm51, -0.1396263F, -1.32645F, 0F);
      Arm53 = new ModelRenderer(this, 18, 0);
      Arm53.mirror = true;
      Arm53.addBox(-2F, -0.5F, 1F, 1, 1, 8);
      Arm53.setRotationPoint(0F, 0F, 0F);
      Arm53.setTextureSize(64, 32);
      Arm53.mirror = true;
      setRotation(Arm53, -0.0872665F, -1.186824F, 0F);
      Arm53.mirror = false;
      Arm52 = new ModelRenderer(this, 18, 0);
      Arm52.addBox(1F, -0.5F, 1F, 1, 1, 8);
      Arm52.setRotationPoint(0F, 0F, 0F);
      Arm52.setTextureSize(64, 32);
      Arm52.mirror = true;
      setRotation(Arm52, -0.0872665F, -1.466077F, 0F);
  }
   
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
    Arm11.render(f5);
    Arm13.render(f5);
    Arm12.render(f5);
    Arm21.render(f5);
    Arm23.render(f5);
    Arm22.render(f5);
    Arm31.render(f5);
    Arm33.render(f5);
    Arm32.render(f5);
    Arm41.render(f5);
    Arm43.render(f5);
    Arm42.render(f5);
    Arm51.render(f5);
    Arm53.render(f5);
    Arm52.render(f5);
  }
   
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
   
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }
 
}