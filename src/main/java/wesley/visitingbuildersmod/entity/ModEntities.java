package wesley.visitingbuildersmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import wesley.visitingbuildersmod.VisitingBuilders;

import static wesley.visitingbuildersmod.VisitingBuilders.id;

public class ModEntities {
    // Register Mod Entities, then call in Main. (Auto)

    public static final EntityType<BuilderEntity> BUILDER = Registry.register(Registries.ENTITY_TYPE, id("builder"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, BuilderEntity::new).dimensions(EntityDimensions.fixed(1f,1f)).build());



    public static void registerModEntities() {
        VisitingBuilders.LOGGER.info("Registering Entities for " + VisitingBuilders.MOD_ID);
    }
}
