package LizaCraft.Entity;

import org.bukkit.entity.Arrow;
import Liza.LizaArrow;

// TODO: Auto-generated Javadoc
/**
 * LizeCraftArrow is the Liza entity representation of the Bukkit Arrow class.
 * 
 * @author geislekj
 */
public class LizaCraftArrow extends LizaCraftProjectile implements LizaArrow {

	/**
	 * LizaCraftArrow Constructor.
	 *
	 * @param arrow This is a Bukkit Arrow entity
	 */
	public LizaCraftArrow(Arrow arrow) {
		super(arrow);
	}

	/* (non-Javadoc)
	 * @see LizaCraft.Entity.LizaCraftProjectile#getBukkitHandle()
	 */
	@Override
	public Arrow getBukkitHandle() {
		return (Arrow) this.entity;
	}

}