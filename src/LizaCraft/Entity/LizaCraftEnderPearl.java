package LizaCraft.Entity;

import org.bukkit.entity.EnderPearl;
import Liza.LizaEnderPearl;

// TODO: Auto-generated Javadoc
/**
 *  LizaCraftEnderPearl is the Liza entity representation of
 *  the Bukkit EnderPearl class.
 *  
 * @author collinbc
 */
public class LizaCraftEnderPearl extends LizaCraftProjectile implements LizaEnderPearl {

	/**
	 * LizaCraftEnderPearl Constructor.
	 *
	 * @param pearl This is a Bukkit EnderPearl entity
	 */
	public LizaCraftEnderPearl(EnderPearl pearl) {
		super(pearl);
	}
	
	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftProjectile#getBukkitHandle()
	 */
	@Override
	public EnderPearl getBukkitHandle() {
		return (EnderPearl) this.entity;
	}
}

