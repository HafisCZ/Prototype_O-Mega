package mar21.omega.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class powered_melter_model extends ModelBase
{
  //fields
    ModelRenderer FRAME;
    ModelRenderer LEG1;
    ModelRenderer LEG2;
    ModelRenderer MONITOR;
    ModelRenderer KEYBOARD;
    ModelRenderer MONITORFRAME1;
    ModelRenderer MONITORFRAME2;
    ModelRenderer MELTINGCORE;
    ModelRenderer SIDE1;
    ModelRenderer SIDE2;
    ModelRenderer SIDE3;
    ModelRenderer SIDE4;
    ModelRenderer HEAT;
  
  public powered_melter_model()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      FRAME = new ModelRenderer(this, 16, 52);
      FRAME.addBox(0F, 0F, 0F, 14, 2, 10);
      FRAME.setRotationPoint(-7F, 21F, -4F);
      FRAME.setTextureSize(64, 64);
      FRAME.mirror = true;
      setRotation(FRAME, 0F, 0F, 0F);
      LEG1 = new ModelRenderer(this, 28, 34);
      LEG1.addBox(0F, 0F, 0F, 2, 2, 16);
      LEG1.setRotationPoint(6F, 22F, -8F);
      LEG1.setTextureSize(64, 64);
      LEG1.mirror = true;
      setRotation(LEG1, 0F, 0F, 0F);
      LEG2 = new ModelRenderer(this, 28, 16);
      LEG2.addBox(0F, 0F, 0F, 2, 2, 16);
      LEG2.setRotationPoint(-8F, 22F, -8F);
      LEG2.setTextureSize(64, 64);
      LEG2.mirror = true;
      setRotation(LEG2, 0F, 0F, 0F);
      MONITOR = new ModelRenderer(this, 42, 9);
      MONITOR.addBox(0F, 0F, 0F, 10, 6, 1);
      MONITOR.setRotationPoint(-5F, 14F, -3F);
      MONITOR.setTextureSize(64, 64);
      MONITOR.mirror = true;
      setRotation(MONITOR, 0F, 0F, 0F);
      KEYBOARD = new ModelRenderer(this, 32, 4);
      KEYBOARD.addBox(0F, 0F, 0F, 12, 1, 4);
      KEYBOARD.setRotationPoint(-6F, 23F, -8F);
      KEYBOARD.setTextureSize(64, 64);
      KEYBOARD.mirror = true;
      setRotation(KEYBOARD, 0F, 0F, 0F);
      MONITORFRAME1 = new ModelRenderer(this, 23, 44);
      MONITORFRAME1.addBox(0F, 0F, 0F, 1, 7, 1);
      MONITORFRAME1.setRotationPoint(5F, 14F, -3F);
      MONITORFRAME1.setTextureSize(64, 64);
      MONITORFRAME1.mirror = true;
      setRotation(MONITORFRAME1, 0F, 0F, 0F);
      MONITORFRAME2 = new ModelRenderer(this, 23, 44);
      MONITORFRAME2.addBox(0F, 0F, 0F, 1, 7, 1);
      MONITORFRAME2.setRotationPoint(-6F, 14F, -3F);
      MONITORFRAME2.setTextureSize(64, 64);
      MONITORFRAME2.mirror = true;
      setRotation(MONITORFRAME2, 0F, 0F, 0F);
      MELTINGCORE = new ModelRenderer(this, 34, 9);
      MELTINGCORE.addBox(0F, 0F, 0F, 2, 6, 2);
      MELTINGCORE.setRotationPoint(-1F, 15F, 1F);
      MELTINGCORE.setTextureSize(64, 64);
      MELTINGCORE.mirror = true;
      setRotation(MELTINGCORE, 0F, 0F, 0F);
      SIDE1 = new ModelRenderer(this, 0, 10);
      SIDE1.addBox(0F, 0F, 0F, 1, 5, 6);
      SIDE1.setRotationPoint(-3F, 16F, -1F);
      SIDE1.setTextureSize(64, 64);
      SIDE1.mirror = true;
      setRotation(SIDE1, 0F, 0F, 0F);
      SIDE2 = new ModelRenderer(this, 14, 10);
      SIDE2.addBox(0F, 0F, 0F, 1, 5, 6);
      SIDE2.setRotationPoint(2F, 16F, -1F);
      SIDE2.setTextureSize(64, 64);
      SIDE2.mirror = true;
      setRotation(SIDE2, 0F, 0F, 0F);
      SIDE3 = new ModelRenderer(this, 10, 0);
      SIDE3.addBox(0F, 0F, 0F, 4, 5, 1);
      SIDE3.setRotationPoint(-2F, 16F, -1F);
      SIDE3.setTextureSize(64, 64);
      SIDE3.mirror = true;
      setRotation(SIDE3, 0F, 0F, 0F);
      SIDE4 = new ModelRenderer(this, 0, 0);
      SIDE4.addBox(0F, 0F, 0F, 4, 5, 1);
      SIDE4.setRotationPoint(-2F, 16F, 4F);
      SIDE4.setTextureSize(64, 64);
      SIDE4.mirror = true;
      setRotation(SIDE4, 0F, 0F, 0F);
      HEAT = new ModelRenderer(this, 0, 22);
      HEAT.addBox(0F, 0F, 0F, 4, 1, 4);
      HEAT.setRotationPoint(-2F, 20F, 0F);
      HEAT.setTextureSize(64, 64);
      HEAT.mirror = true;
      setRotation(HEAT, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    FRAME.render(f5);
    LEG1.render(f5);
    LEG2.render(f5);
    MONITOR.render(f5);
    KEYBOARD.render(f5);
    MONITORFRAME1.render(f5);
    MONITORFRAME2.render(f5);
    MELTINGCORE.render(f5);
    SIDE1.render(f5);
    SIDE2.render(f5);
    SIDE3.render(f5);
    SIDE4.render(f5);
    HEAT.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
