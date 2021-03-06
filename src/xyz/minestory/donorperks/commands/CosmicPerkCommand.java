package xyz.minestory.donorperks.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.minestory.donorperks.guis.CosmicGUI;


public class CosmicPerkCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;

        if (commandSender instanceof Player){
            player.openInventory(CosmicGUI.CosmicInventory);
            return true;
        }else{
            commandSender.sendMessage("Run this from ingame to see the donor perks");
        }
        return false;
    }
}
