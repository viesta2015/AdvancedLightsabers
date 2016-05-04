package fiskfille.lightsabers.client.model.lightsaber;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelEmitterFulcrum extends ModelBase
{
    public ModelRenderer body1;
    public ModelRenderer middleRing1;
    public ModelRenderer emitter1_1;
    public ModelRenderer emitter2_1;
    public ModelRenderer body2;
    public ModelRenderer body4;
    public ModelRenderer body6;
    public ModelRenderer body12;
    public ModelRenderer body18;
    public ModelRenderer body3;
    public ModelRenderer body5;
    public ModelRenderer body7;
    public ModelRenderer body8;
    public ModelRenderer body9;
    public ModelRenderer body10;
    public ModelRenderer body11;
    public ModelRenderer body13;
    public ModelRenderer body14;
    public ModelRenderer body15;
    public ModelRenderer body16;
    public ModelRenderer body17;
    public ModelRenderer body19;
    public ModelRenderer body21;
    public ModelRenderer body20;
    public ModelRenderer body22;
    public ModelRenderer middleRing2;
    public ModelRenderer middleRing4;
    public ModelRenderer middleRing6;
    public ModelRenderer middleRing7;
    public ModelRenderer middleRing8;
    public ModelRenderer middleRing3;
    public ModelRenderer middleRing5;
    public ModelRenderer middleRing9;
    public ModelRenderer middleRing11;
    public ModelRenderer middleRing10;
    public ModelRenderer middleRing12;
    public ModelRenderer emitter1_2;
    public ModelRenderer emitter1_3;
    public ModelRenderer emitter1_4;
    public ModelRenderer emitter1_5;
    public ModelRenderer emitter1_6;
    public ModelRenderer emitter1_7;
    public ModelRenderer emitter1_8;
    public ModelRenderer emitter2_2;
    public ModelRenderer emitter2_3;
    public ModelRenderer emitter2_4;
    public ModelRenderer emitter2_5;
    public ModelRenderer emitter2_6;
    public ModelRenderer emitter2_7;
    public ModelRenderer emitter2_8;

    public ModelEmitterFulcrum()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.emitter2_6 = new ModelRenderer(this, 8, 23);
        this.emitter2_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.emitter2_6.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(emitter2_6, 0.0F, -2.356194490192345F, 0.0F);
        this.body22 = new ModelRenderer(this, 8, 0);
        this.body22.mirror = true;
        this.body22.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.body22.addBox(0.0F, -16.5F, -1.0F, 1, 16, 1, 0.0F);
        this.setRotateAngle(body22, 0.0F, 0.4721115626644662F, 0.0F);
        this.middleRing6 = new ModelRenderer(this, 0, 17);
        this.middleRing6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.middleRing6.addBox(-2.98F, -0.5F, -2.5F, 1, 1, 5, 0.0F);
        this.body12 = new ModelRenderer(this, 8, 0);
        this.body12.mirror = true;
        this.body12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body12.addBox(1.98F, -16.0F, 1.5F, 1, 16, 1, 0.0F);
        this.middleRing5 = new ModelRenderer(this, 0, 17);
        this.middleRing5.mirror = true;
        this.middleRing5.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.middleRing5.addBox(0.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(middleRing5, 0.0F, 0.4721115626644662F, 0.0F);
        this.emitter1_8 = new ModelRenderer(this, 12, 19);
        this.emitter1_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.emitter1_8.addBox(-1.5F, -3.0F, 2.62F, 3, 3, 1, 0.0F);
        this.setRotateAngle(emitter1_8, 0.0F, -0.7853981633974483F, 0.0F);
        this.emitter1_2 = new ModelRenderer(this, 12, 19);
        this.emitter1_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.emitter1_2.addBox(-1.5F, -3.0F, 2.62F, 3, 3, 1, 0.0F);
        this.setRotateAngle(emitter1_2, 0.0F, 0.7853981633974483F, 0.0F);
        this.body14 = new ModelRenderer(this, 12, 0);
        this.body14.mirror = true;
        this.body14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body14.addBox(1.58F, -13.0F, -3.0F, 1, 13, 6, 0.0F);
        this.emitter1_7 = new ModelRenderer(this, 12, 19);
        this.emitter1_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.emitter1_7.addBox(-1.5F, -3.0F, 2.62F, 3, 3, 1, 0.0F);
        this.setRotateAngle(emitter1_7, 0.0F, -1.5707963267948966F, 0.0F);
        this.body19 = new ModelRenderer(this, 8, 0);
        this.body19.setRotationPoint(-1.5F, 0.5F, 3.76F);
        this.body19.addBox(-1.0F, -16.5F, -1.0F, 1, 16, 1, 0.0F);
        this.setRotateAngle(body19, 0.0F, -0.46949356878647464F, 0.0F);
        this.emitter2_2 = new ModelRenderer(this, 8, 23);
        this.emitter2_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.emitter2_2.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(emitter2_2, 0.0F, 0.7853981633974483F, 0.0F);
        this.body16 = new ModelRenderer(this, 8, 25);
        this.body16.mirror = true;
        this.body16.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.body16.addBox(-0.5F, -1.0F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(body16, 0.6108652381980153F, 0.0F, 0.0F);
        this.middleRing7 = new ModelRenderer(this, 0, 17);
        this.middleRing7.mirror = true;
        this.middleRing7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.middleRing7.addBox(1.98F, -0.5F, -2.5F, 1, 1, 5, 0.0F);
        this.middleRing11 = new ModelRenderer(this, 0, 17);
        this.middleRing11.mirror = true;
        this.middleRing11.setRotationPoint(1.5F, 0.0F, 3.76F);
        this.middleRing11.addBox(0.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(middleRing11, 0.0F, 0.46949356878647464F, 0.0F);
        this.body7 = new ModelRenderer(this, 8, 0);
        this.body7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body7.addBox(-2.98F, -16.0F, -2.5F, 1, 16, 1, 0.0F);
        this.middleRing9 = new ModelRenderer(this, 0, 17);
        this.middleRing9.setRotationPoint(-1.5F, 0.0F, 3.76F);
        this.middleRing9.addBox(-1.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(middleRing9, 0.0F, -0.46949356878647464F, 0.0F);
        this.middleRing1 = new ModelRenderer(this, 0, 23);
        this.middleRing1.setRotationPoint(0.0F, -13.5F, 0.0F);
        this.middleRing1.addBox(-1.5F, -0.5F, 2.76F, 3, 1, 1, 0.0F);
        this.body20 = new ModelRenderer(this, 8, 0);
        this.body20.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.body20.addBox(-1.0F, -16.5F, -1.0F, 1, 16, 1, 0.0F);
        this.setRotateAngle(body20, 0.0F, -0.4721115626644662F, 0.0F);
        this.body2 = new ModelRenderer(this, 8, 0);
        this.body2.setRotationPoint(-1.5F, 0.5F, 3.76F);
        this.body2.addBox(-1.0F, -16.5F, -1.0F, 1, 16, 1, 0.0F);
        this.setRotateAngle(body2, 0.0F, -0.46949356878647464F, 0.0F);
        this.emitter1_6 = new ModelRenderer(this, 12, 19);
        this.emitter1_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.emitter1_6.addBox(-1.5F, -3.0F, 2.62F, 3, 3, 1, 0.0F);
        this.setRotateAngle(emitter1_6, 0.0F, -2.356194490192345F, 0.0F);
        this.body18 = new ModelRenderer(this, 0, 0);
        this.body18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body18.addBox(-1.5F, -16.0F, 2.76F, 3, 16, 1, 0.0F);
        this.setRotateAngle(body18, 0.0F, 3.141592653589793F, 0.0F);
        this.emitter1_4 = new ModelRenderer(this, 12, 19);
        this.emitter1_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.emitter1_4.addBox(-1.5F, -3.0F, 2.62F, 3, 3, 1, 0.0F);
        this.setRotateAngle(emitter1_4, 0.0F, 2.356194490192345F, 0.0F);
        this.body17 = new ModelRenderer(this, 6, 25);
        this.body17.mirror = true;
        this.body17.setRotationPoint(0.0F, -0.8F, -2.0F);
        this.body17.addBox(-0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F);
        this.emitter2_1 = new ModelRenderer(this, 8, 23);
        this.emitter2_1.setRotationPoint(0.0F, -17.7F, 0.0F);
        this.emitter2_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        this.emitter2_5 = new ModelRenderer(this, 8, 23);
        this.emitter2_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.emitter2_5.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(emitter2_5, 0.0F, 3.141592653589793F, 0.0F);
        this.middleRing8 = new ModelRenderer(this, 0, 23);
        this.middleRing8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.middleRing8.addBox(-1.5F, -0.5F, 2.76F, 3, 1, 1, 0.0F);
        this.setRotateAngle(middleRing8, 0.0F, 3.141592653589793F, 0.0F);
        this.emitter1_5 = new ModelRenderer(this, 12, 19);
        this.emitter1_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.emitter1_5.addBox(-1.5F, -3.0F, 2.62F, 3, 3, 1, 0.0F);
        this.setRotateAngle(emitter1_5, 0.0F, 3.141592653589793F, 0.0F);
        this.body15 = new ModelRenderer(this, 0, 25);
        this.body15.mirror = true;
        this.body15.setRotationPoint(2.48F, -12.5F, 1.5F);
        this.body15.addBox(-0.5F, -3.5F, -3.0F, 1, 4, 3, 0.0F);
        this.middleRing10 = new ModelRenderer(this, 0, 17);
        this.middleRing10.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.middleRing10.addBox(-1.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(middleRing10, 0.0F, -0.4721115626644662F, 0.0F);
        this.body4 = new ModelRenderer(this, 8, 0);
        this.body4.mirror = true;
        this.body4.setRotationPoint(1.5F, 0.5F, 3.76F);
        this.body4.addBox(0.0F, -16.5F, -1.0F, 1, 16, 1, 0.0F);
        this.setRotateAngle(body4, 0.0F, 0.46949356878647464F, 0.0F);
        this.emitter2_7 = new ModelRenderer(this, 8, 23);
        this.emitter2_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.emitter2_7.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(emitter2_7, 0.0F, -1.5707963267948966F, 0.0F);
        this.body11 = new ModelRenderer(this, 6, 25);
        this.body11.setRotationPoint(0.0F, -0.8F, -2.0F);
        this.body11.addBox(-0.5F, -1.0F, -1.0F, 1, 1, 2, 0.0F);
        this.body1 = new ModelRenderer(this, 0, 0);
        this.body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body1.addBox(-1.5F, -16.0F, 2.76F, 3, 16, 1, 0.0F);
        this.middleRing3 = new ModelRenderer(this, 0, 17);
        this.middleRing3.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.middleRing3.addBox(-1.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(middleRing3, 0.0F, -0.4721115626644662F, 0.0F);
        this.middleRing12 = new ModelRenderer(this, 0, 17);
        this.middleRing12.mirror = true;
        this.middleRing12.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.middleRing12.addBox(0.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(middleRing12, 0.0F, 0.4721115626644662F, 0.0F);
        this.middleRing2 = new ModelRenderer(this, 0, 17);
        this.middleRing2.setRotationPoint(-1.5F, 0.0F, 3.76F);
        this.middleRing2.addBox(-1.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(middleRing2, 0.0F, -0.46949356878647464F, 0.0F);
        this.body21 = new ModelRenderer(this, 8, 0);
        this.body21.mirror = true;
        this.body21.setRotationPoint(1.5F, 0.5F, 3.76F);
        this.body21.addBox(0.0F, -16.5F, -1.0F, 1, 16, 1, 0.0F);
        this.setRotateAngle(body21, 0.0F, 0.46949356878647464F, 0.0F);
        this.emitter1_1 = new ModelRenderer(this, 12, 19);
        this.emitter1_1.setRotationPoint(0.0F, -15.4F, 0.0F);
        this.emitter1_1.addBox(-1.5F, -3.0F, 2.62F, 3, 3, 1, 0.0F);
        this.body8 = new ModelRenderer(this, 12, 0);
        this.body8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body8.addBox(-2.58F, -13.0F, -3.0F, 1, 13, 6, 0.0F);
        this.body13 = new ModelRenderer(this, 8, 0);
        this.body13.mirror = true;
        this.body13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body13.addBox(1.98F, -16.0F, -2.5F, 1, 16, 1, 0.0F);
        this.body10 = new ModelRenderer(this, 8, 25);
        this.body10.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.body10.addBox(-0.5F, -1.0F, -4.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(body10, 0.6108652381980153F, 0.0F, 0.0F);
        this.body5 = new ModelRenderer(this, 8, 0);
        this.body5.mirror = true;
        this.body5.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.body5.addBox(0.0F, -16.5F, -1.0F, 1, 16, 1, 0.0F);
        this.setRotateAngle(body5, 0.0F, 0.4721115626644662F, 0.0F);
        this.middleRing4 = new ModelRenderer(this, 0, 17);
        this.middleRing4.mirror = true;
        this.middleRing4.setRotationPoint(1.5F, 0.0F, 3.76F);
        this.middleRing4.addBox(0.0F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(middleRing4, 0.0F, 0.46949356878647464F, 0.0F);
        this.emitter2_8 = new ModelRenderer(this, 8, 23);
        this.emitter2_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.emitter2_8.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(emitter2_8, 0.0F, -0.7853981633974483F, 0.0F);
        this.body9 = new ModelRenderer(this, 0, 25);
        this.body9.setRotationPoint(-2.48F, -12.5F, 1.5F);
        this.body9.addBox(-0.5F, -3.5F, -3.0F, 1, 4, 3, 0.0F);
        this.emitter1_3 = new ModelRenderer(this, 12, 19);
        this.emitter1_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.emitter1_3.addBox(-1.5F, -3.0F, 2.62F, 3, 3, 1, 0.0F);
        this.setRotateAngle(emitter1_3, 0.0F, 1.5707963267948966F, 0.0F);
        this.emitter2_3 = new ModelRenderer(this, 8, 23);
        this.emitter2_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.emitter2_3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(emitter2_3, 0.0F, 1.5707963267948966F, 0.0F);
        this.body3 = new ModelRenderer(this, 8, 0);
        this.body3.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.body3.addBox(-1.0F, -16.5F, -1.0F, 1, 16, 1, 0.0F);
        this.setRotateAngle(body3, 0.0F, -0.4721115626644662F, 0.0F);
        this.body6 = new ModelRenderer(this, 8, 0);
        this.body6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body6.addBox(-2.98F, -16.0F, 1.5F, 1, 16, 1, 0.0F);
        this.emitter2_4 = new ModelRenderer(this, 8, 23);
        this.emitter2_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.emitter2_4.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        this.setRotateAngle(emitter2_4, 0.0F, 2.356194490192345F, 0.0F);
        this.emitter2_1.addChild(this.emitter2_6);
        this.body21.addChild(this.body22);
        this.middleRing1.addChild(this.middleRing6);
        this.body1.addChild(this.body12);
        this.middleRing4.addChild(this.middleRing5);
        this.emitter1_1.addChild(this.emitter1_8);
        this.emitter1_1.addChild(this.emitter1_2);
        this.body12.addChild(this.body14);
        this.emitter1_1.addChild(this.emitter1_7);
        this.body18.addChild(this.body19);
        this.emitter2_1.addChild(this.emitter2_2);
        this.body15.addChild(this.body16);
        this.middleRing1.addChild(this.middleRing7);
        this.middleRing8.addChild(this.middleRing11);
        this.body6.addChild(this.body7);
        this.middleRing8.addChild(this.middleRing9);
        this.body19.addChild(this.body20);
        this.body1.addChild(this.body2);
        this.emitter1_1.addChild(this.emitter1_6);
        this.body1.addChild(this.body18);
        this.emitter1_1.addChild(this.emitter1_4);
        this.body16.addChild(this.body17);
        this.emitter2_1.addChild(this.emitter2_5);
        this.middleRing1.addChild(this.middleRing8);
        this.emitter1_1.addChild(this.emitter1_5);
        this.body12.addChild(this.body15);
        this.middleRing9.addChild(this.middleRing10);
        this.body1.addChild(this.body4);
        this.emitter2_1.addChild(this.emitter2_7);
        this.body10.addChild(this.body11);
        this.middleRing2.addChild(this.middleRing3);
        this.middleRing11.addChild(this.middleRing12);
        this.middleRing1.addChild(this.middleRing2);
        this.body18.addChild(this.body21);
        this.body6.addChild(this.body8);
        this.body12.addChild(this.body13);
        this.body9.addChild(this.body10);
        this.body4.addChild(this.body5);
        this.middleRing1.addChild(this.middleRing4);
        this.emitter2_1.addChild(this.emitter2_8);
        this.body6.addChild(this.body9);
        this.emitter1_1.addChild(this.emitter1_3);
        this.emitter2_1.addChild(this.emitter2_3);
        this.body2.addChild(this.body3);
        this.body1.addChild(this.body6);
        this.emitter2_1.addChild(this.emitter2_4);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    { 
        GL11.glPushMatrix();
        GL11.glTranslatef(this.middleRing1.offsetX, this.middleRing1.offsetY, this.middleRing1.offsetZ);
        GL11.glTranslatef(this.middleRing1.rotationPointX * f5, this.middleRing1.rotationPointY * f5, this.middleRing1.rotationPointZ * f5);
        GL11.glScaled(1.1D, 0.6D, 1.1D);
        GL11.glTranslatef(-this.middleRing1.offsetX, -this.middleRing1.offsetY, -this.middleRing1.offsetZ);
        GL11.glTranslatef(-this.middleRing1.rotationPointX * f5, -this.middleRing1.rotationPointY * f5, -this.middleRing1.rotationPointZ * f5);
        this.middleRing1.render(f5);
        GL11.glPopMatrix();
        this.emitter2_1.render(f5);
        this.body1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.emitter1_1.offsetX, this.emitter1_1.offsetY, this.emitter1_1.offsetZ);
        GL11.glTranslatef(this.emitter1_1.rotationPointX * f5, this.emitter1_1.rotationPointY * f5, this.emitter1_1.rotationPointZ * f5);
        GL11.glScaled(0.9D, 0.9D, 0.9D);
        GL11.glTranslatef(-this.emitter1_1.offsetX, -this.emitter1_1.offsetY, -this.emitter1_1.offsetZ);
        GL11.glTranslatef(-this.emitter1_1.rotationPointX * f5, -this.emitter1_1.rotationPointY * f5, -this.emitter1_1.rotationPointZ * f5);
        this.emitter1_1.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
