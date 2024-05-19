package net.guh.cenozoicfauna.entity.client;

import net.guh.cenozoicfauna.entity.animation.ModAnimations;
import net.guh.cenozoicfauna.entity.custom.ThylacineEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

public class ThylacineModel<T extends ThylacineEntity> extends SinglePartEntityModel<T> {
    private final ModelPart thylacine;
    private final ModelPart head;

    public ThylacineModel(ModelPart root) {
        this.thylacine = root.getChild("Thylacine");
        this.head = thylacine.getChild("Torso").getChild("Head");
    }


    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData Root = modelPartData.addChild("Thylacine", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 16.5F, 0.0F));

        ModelPartData Torso = Root.addChild("Torso", ModelPartBuilder.create().uv(0, 0).cuboid(-2.5F, -2.5F, -9.0F, 5.0F, 5.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 3.5F));

        ModelPartData Head = Torso.addChild("Head", ModelPartBuilder.create().uv(13, 16).cuboid(-3.0F, -1.0F, -4.0F, 6.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.5F, -9.0F));

        ModelPartData Muzzle = Head.addChild("Muzzle", ModelPartBuilder.create().uv(21, 0).cuboid(-1.5F, -2.0F, -3.0F, 3.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 3.0F, -4.0F));

        ModelPartData Left_Ear = Head.addChild("Left_Ear", ModelPartBuilder.create().uv(0, 7).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -1.0F, -1.0F));

        ModelPartData Right_Ear = Head.addChild("Right_Ear", ModelPartBuilder.create().uv(21, 5).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -1.0F, -1.0F));

        ModelPartData Tail = Torso.addChild("Tail", ModelPartBuilder.create().uv(0, 16).cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 11.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.5F, 2.0F));

        ModelPartData Left_Front_Limb = Root.addChild("Left_Front_Limb", ModelPartBuilder.create().uv(0, 28).cuboid(-0.5F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.5F, 2.5F, -3.5F));

        ModelPartData Right_Front_Limb = Root.addChild("Right_Front_Limb", ModelPartBuilder.create().uv(24, 24).cuboid(-1.5F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.5F, 2.5F, -3.5F));

        ModelPartData Left_Back_Limb = Root.addChild("Left_Back_Limb", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.5F, 2.5F, 3.5F));

        ModelPartData Right_Back_Limb = Root.addChild("Right_Back_Limb", ModelPartBuilder.create().uv(0, 16).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.5F, 2.5F, 3.5F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(ModAnimations.THYLACINEWALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, ModAnimations.THYLACINEIDLE, ageInTicks, 1f);

    }

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0f);
        headPitch = MathHelper.clamp(headPitch, -25.0F, 20.0f);

        this.head.yaw = headYaw * 0.01453292f;
        this.head.pitch = headPitch * 0.01453292f;
    }


    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        thylacine.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return thylacine;
    }

}
