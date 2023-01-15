package net.D4NG3Rzk.tutorialmod.block.entity;

import net.D4NG3Rzk.tutorialmod.TutorialMod;
import net.D4NG3Rzk.tutorialmod.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TutorialMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<CalderoBlockEntity>> CALDERO =
            BLOCK_ENTITIES.register("caldero", () ->
                    BlockEntityType.Builder.of(CalderoBlockEntity::new,
                            ModBlocks.CALDERO.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
