package wesley.visitingbuildersmod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class BuilderEntity<E> extends PathAwareEntity {
    public BuilderEntity(EntityType<? extends BuilderEntity<E>> entityType, World world) {
        super(entityType, world);
    }
}
