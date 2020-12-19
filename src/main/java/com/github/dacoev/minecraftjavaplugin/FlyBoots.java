package com.github.dacoev.minecraftjavaplugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class FlyBoots implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        // /flyboots
        if(label.equalsIgnoreCase("flyboots")){
            if(!(sender instanceof Player)){
                sender.sendMessage("Sorry console you're not allowed to use this command");
            }
            Player player = (Player) sender;

            player.getInventory().addItem(getItem());
            player.sendMessage(ChatColor.GOLD + "The Minecraft Legends gave you a gift");
            return true;
        }
        return false;
    }

    public ItemStack getItem(){
        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = boots.getItemMeta();

        meta.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Boots of Leaping");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GOLD + "" + ChatColor.ITALIC + "Boots made for the Minecraft Jumpers");
        meta.setLore(lore);

        meta.addEnchant(Enchantment.PROTECTION_FALL, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setUnbreakable(true);

        boots.setItemMeta(meta);

        return boots;
    }
}
