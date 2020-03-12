package pt.ganda.thecrimscraft;

import org.bukkit.plugin.java.JavaPlugin;
import pt.ganda.thecrimscraft.commands.Help;

public class Main extends JavaPlugin {

    public void onEnable(){
        System.out.println("TheCrimsCraft started");
        this.getCommand("help").setExecutor(new Help());
    }
    public void onDisable(){
        System.out.println("Shutting down..!");

    }
}
