package net.guh.cenozoicfauna.entity.client;

import net.guh.cenozoicfauna.entity.animation.ModAnimations;
import net.guh.cenozoicfauna.entity.custom.SmilodonEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class SmilodonModel<T extends SmilodonEntity> extends SinglePartEntityModel<T> {
    private final ModelPart smilodon;
    private final ModelPart head;

    public SmilodonModel(ModelPart root) {
        this.smilodon = root.getChild("Smilodon");
        this.head = smilodon.getChild("Lower_Body").getChild("Upper_Torso").getChild("Head");
    }


    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData Root = modelPartData.addChild("Smilodon", ModelPartBuilder.create(), ModelTransform.pivot( 0.0F, 10.0F, 3.0F));

        ModelPartData Lower_Body = Root.addChild("Lower_Body", ModelPartBuilder.create().uv(0, 22).cuboid(-4.5F, -7.0F, -7.0F, 9.0F, 9.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 3.0F, 6.5F));

        ModelPartData Tail = Lower_Body.addChild("Tail", ModelPartBuilder.create().uv(50, 40).cuboid(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -5.0F, 3.0F, 1.0472F, 0.0F, 0.0F));

        ModelPartData Upper_Torso = Lower_Body.addChild("Upper_Torso", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -6.0F, -10.0F, 10.0F, 12.0F, 10.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.0F, -7.0F));

        ModelPartData Head = Upper_Torso.addChild("Head", ModelPartBuilder.create().uv(34, 16).cuboid(-4.5F, -1.0F, -6.0F, 9.0F, 7.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -6.0F, -10.0F));

        ModelPartData Fluff_r1 = Head.addChild("Fluff_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0F, -3.5F, 0.0F, 2.0F, 7.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-4.5F, 2.5F, -6.0F, 0.0F, 0.5236F, 0.0F));

        ModelPartData Fluff_r2 = Head.addChild("Fluff_r2", ModelPartBuilder.create().uv(4, 0).cuboid(0.0F, -3.5F, 0.0F, 2.0F, 7.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(4.5F, 2.5F, -6.0F, 0.0F, -0.5236F, 0.0F));

        ModelPartData Upper_Jaw = Head.addChild("Upper_Jaw", ModelPartBuilder.create().uv(38, 29).cuboid(-2.5F, -3.0F, -3.0F, 5.0F, 3.0F, 3.0F, new Dilation(0.0F))
                .uv(8, 3).cuboid(1.5F, 0.0F, -3.01F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F))
                .uv(8, 0).cuboid(-2.5F, 0.0F, -3.01F, 1.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 5.0F, -6.0F));

        ModelPartData Lower_Jaw = Head.addChild("Lower_Jaw", ModelPartBuilder.create().uv(46, 35).cuboid(-2.5F, 0.0F, -3.0F, 5.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 5.0F, -6.0F));

        ModelPartData Left_Ear = Head.addChild("Left_Ear", ModelPartBuilder.create().uv(0, 22).cuboid(-1.5F, -2.0F, -0.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -1.0F, -1.5F));

        ModelPartData Right_Ear = Head.addChild("Right_Ear", ModelPartBuilder.create().uv(0, 7).cuboid(-1.5F, -2.0F, -0.5F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -1.0F, -1.5F));

        ModelPartData Left_Front_Limb = Root.addChild("Left_Front_Limb", ModelPartBuilder.create().uv(0, 41).cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 14.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, 2.0F, -6.5F));

        ModelPartData Right_Front_Limb = Root.addChild("Right_Front_Limb", ModelPartBuilder.create().uv(34, 37).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 14.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, 2.0F, -6.5F));

        ModelPartData Left_Back_Limb = Root.addChild("Left_Back_Limb", ModelPartBuilder.create().uv(16, 41).cuboid(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(4.5F, 4.0F, 6.5F));

        ModelPartData Right_Back_Limb = Root.addChild("Right_Back_Limb", ModelPartBuilder.create().uv(40, 0).cuboid(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.5F, 4.0F, 6.5F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(ModAnimations.SMILODONWALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, ModAnimations.SMILODONIDLE, ageInTicks, 1f);
        this.updateAnimation(entity.attackAnimationState, ModAnimations.SMILODONATTACK, ageInTicks, 1f);

    }

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0f);
        headPitch = MathHelper.clamp(headPitch, -25.0F, 20.0f);

        this.head.yaw = headYaw * 0.01453292f;
        this.head.pitch = headPitch * 0.01453292f;
    }


    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        smilodon.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return smilodon;
    }

}
