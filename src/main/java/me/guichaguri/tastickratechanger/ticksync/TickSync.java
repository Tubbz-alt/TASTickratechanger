package me.guichaguri.tastickratechanger.ticksync;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Makes tickrate only dependant on the server
 * @author Scribble
 *
 */
@SideOnly(Side.CLIENT)
public class TickSync {
	private static int servertickcounter;
	private static int clienttickcounter;
	private static boolean enabled=false;
		
	public TickSync() {
		enabled=false;
	}
	
	public static void sync(boolean enable) {
		enabled=enable;
	}
	public static boolean isEnabled() {
		return enabled;
	}
	public static int getServertickcounter() {
		return servertickcounter;
	}
	public static int getClienttickcounter() {
		return clienttickcounter;
	}
	public static void incrementClienttickcounter() {
		clienttickcounter++;
	}
	public static void setServerTickcounter(int counter) {
		servertickcounter=counter;
	}
	public static void resetTickCounter(){
		clienttickcounter=0;
		servertickcounter=0;
	}
}
