package net.guh.cenozoicfauna.entity.client;

import net.guh.cenozoicfauna.CenozoicFauna;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer MEGALONYX =
            new EntityModelLayer(new Identifier(CenozoicFauna.MOD_ID, "megalonyx"), "main");
    public static final EntityModelLayer THYLACINE =
            new EntityModelLayer(new Identifier(CenozoicFauna.MOD_ID, "thylacine"), "main");
    public static final EntityModelLayer SMILODON =
            new EntityModelLayer(new Identifier(CenozoicFauna.MOD_ID, "smilodon"), "main");
}
