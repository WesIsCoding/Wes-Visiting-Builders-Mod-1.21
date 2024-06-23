package wesley.visitingbuildersmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.LoggerFactory;
import wesley.visitingbuildersmod.entity.ModEntities;

import java.util.logging.Logger;

public class VisitingBuilders implements ModInitializer {

	public static final String MOD_ID = "visitingbuildersmod";
	public static final Logger LOGGER = (Logger) LoggerFactory.getLogger(MOD_ID);

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}


	//public static final Item BUILDER_SPAWN_EGG = new SpawnEggItem(BUILDER, 59191198, 7373205, new Item.Settings());

	@Override
	public void onInitialize() {
		ModEntities.registerModEntities();
	}
}