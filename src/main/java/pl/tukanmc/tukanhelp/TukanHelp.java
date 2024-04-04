package pl.tukanmc.tukanhelp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class TukanHelp extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println('TukanHelp started!');
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("komendy")){

            if (sender instanceof Player){

                Player p = (Player) sender;

            }


        }

        return true;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
