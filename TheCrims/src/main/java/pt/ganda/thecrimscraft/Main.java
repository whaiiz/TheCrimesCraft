package pt.ganda.thecrimscraft;

import org.bukkit.plugin.java.JavaPlugin;
import pt.ganda.thecrimscraft.commands.Help;
import pt.ganda.thecrimscraft.commands.thefts.StoreTheft;
import pt.ganda.thecrimscraft.pluginsetup.StoreTheftSetup;

public class Main extends JavaPlugin {

    public void onEnable(){

        System.out.println("TheCrimsCraft started");
        this.getCommand("help").setExecutor(new Help());
        this.getCommand("StoreTheft").setExecutor(new StoreTheft());
        this.getCommand("StoreTheftSetup").setExecutor(new StoreTheftSetup());

    }
    public void onDisable(){
        System.out.println("Shutting down..!");

    }
}
