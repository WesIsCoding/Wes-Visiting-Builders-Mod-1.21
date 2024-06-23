package wesley.visitingbuildersmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import wesley.visitingbuildersmod.entity.BuilderEntity;

public class VisitingBuilders implements ModInitializer {

	public static final String MOD_ID = "visitingbuildersmod";

	public static final EntityType<BuilderEntity> BUILDER = Registry.register(Registries.ENTITY_TYPE, id("builder"),
			FabricEntityTypeBuilder.create(SpawnGroup.MISC, BuilderEntity::new).dimensions(EntityDimensions.fixed(1f,1f)).build());

	public static final Item BUILDER_SPAWN_EGG = new SpawnEggItem(BUILDER, 59191198, 7373205, new Item.Settings());

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}


	//public static SoundEvent GUARD_AMBIENT = SoundEvent.of(id( "entity.guard.ambient"));
	//public static SoundEvent GUARD_HURT = SoundEvent.of(id( "entity.guard.hurt"));
	//public static SoundEvent GUARD_DEATH = SoundEvent.of(id("entity.guard.death"));

	@Override
	public void onInitialize() {
	}
}