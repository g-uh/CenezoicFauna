package net.guh.cenezoicfauna.entity.client;

import net.guh.cenezoicfauna.entity.animation.ModAnimations;
import net.guh.cenezoicfauna.entity.custom.MegalonyxEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

import javax.swing.text.html.parser.Entity;

public class MegalonyxModel<T extends MegalonyxEntity> extends SinglePartEntityModel<T> {
    private final ModelPart megalonyx;
    private final ModelPart head;

    public MegalonyxModel(ModelPart root) {
        this.megalonyx = root.getChild("Megalonyx");
        this.head = megalonyx.getChild("Lower_Torso").getChild("Upper_Torso").getChild("Head");
    }


    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData Megalonyx = modelPartData.addChild("Megalonyx", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.0F, 0.0F));

        ModelPartData Lower_Torso = Megalonyx.addChild("Lower_Torso", ModelPartBuilder.create().uv(0, 0).cuboid(-9.0F, -17.0F, -1.0F, 17.0F, 17.0F, 15.0F, new Dilation(0.0F)), ModelTransform.pivot(0.5F, 10.0F, 1.0F));

        ModelPartData Upper_Torso = Lower_Torso.addChild("Upper_Torso", ModelPartBuilder.create().uv(0, 32).cuboid(-6.5F, 0.0F, -14.0F, 13.0F, 15.0F, 15.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.5F, -17.0F, -1.0F));

        ModelPartData Head = Upper_Torso.addChild("Head", ModelPartBuilder.create().uv(55, 28).cuboid(-4.5F, -4.0F, -9.0F, 9.0F, 8.0F, 9.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 5.0F, -14.0F));

        ModelPartData Muzzle = Head.addChild("Muzzle", ModelPartBuilder.create().uv(66, 45).cuboid(-2.0F, -3.0F, -3.0F, 5.0F, 6.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.5F, -1.0F, -11.0F));

        ModelPartData Left_Ear = Muzzle.addChild("Left_Ear", ModelPartBuilder.create().uv(0, 3).cuboid(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -3.0F, 8.0F, 0.0F, 0.0F, -1.3963F));

        ModelPartData Right_Ear = Muzzle.addChild("Right_Ear", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, -3.0F, 8.0F, 0.0F, 0.0F, 1.3963F));

        ModelPartData Tail = Lower_Torso.addChild("Tail", ModelPartBuilder.create().uv(42, 48).cuboid(-3.0F, 0.0F, 0.0F, 5.0F, 5.0F, 14.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -15.0F, 14.0F));

        ModelPartData Left_Front_Limb = Megalonyx.addChild("Left_Front_Limb", ModelPartBuilder.create().uv(64, 0).cuboid(-4.0F, -1.5F, -4.0F, 6.0F, 19.0F, 8.0F, new Dilation(0.0F))
                .uv(73, 60).cuboid(-6.0F, 16.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(8.5F, 1.5F, -8.0F));

        ModelPartData Right_Front_Limb = Megalonyx.addChild("Right_Front_Limb", ModelPartBuilder.create().uv(0, 62).cuboid(-2.0F, -1.5F, -4.0F, 6.0F, 19.0F, 8.0F, new Dilation(0.0F))
                .uv(42, 38).cuboid(4.0F, 16.5F, -3.5F, 2.0F, 1.0F, 7.0F, new Dilation(0.0F)), ModelTransform.pivot(-8.5F, 1.5F, -8.0F));

        ModelPartData Left_Back_Limb = Megalonyx.addChild("Left_Back_Limb", ModelPartBuilder.create().uv(52, 67).cuboid(-5.0F, -1.5F, -3.0F, 6.0F, 13.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(8.5F, 7.5F, 10.0F));

        ModelPartData Right_Back_Limb = Megalonyx.addChild("Right_Back_Limb", ModelPartBuilder.create().uv(28, 67).cuboid(-1.0F, -1.5F, -3.0F, 6.0F, 13.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-8.5F, 7.5F, 10.0F));
        return TexturedModelData.of(modelData, 128, 128);
    }
    @Override
    public void setAngles(MegalonyxEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(ModAnimations.MEGALONYXWALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, ModAnimations.MEGALONYXIDLE, ageInTicks, 1f);
        this.updateAnimation(entity.attackAnimationState, ModAnimations.MEGALONYXATTACK, ageInTicks, 1f);

    }

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0f);
        headPitch = MathHelper.clamp(headPitch, -16.0F, -7.0f);

        this.head.yaw = headYaw * 0.17453292f;
        this.head.pitch = headPitch * 0.17453292f;
    }


    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        megalonyx.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return megalonyx;
    }
}
