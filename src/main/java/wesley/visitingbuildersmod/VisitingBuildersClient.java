package wesley.visitingbuildersmod;

import net.fabricmc.api.ClientModInitializer;
import wesley.visitingbuildersmod.client.ModEntityRenderers;

public class VisitingBuildersClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModEntityRenderers.registerRenderers();

    }
}
