/* Licensed under GNU General Public License v3.0 */
package me.supradev.welcomemessenger;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnPlayerJoin implements Listener {
  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event) {
    Player player = event.getPlayer();
    if (!player.hasPlayedBefore()) {
      TextComponent welcomeComponent =
          Component.text("Welcome our new player ", NamedTextColor.YELLOW)
              .append(Component.text(player.getName(), NamedTextColor.GOLD))
              .append(Component.text("!", NamedTextColor.YELLOW));
      WelcomeMessenger.pluginInstance.getServer().broadcast(welcomeComponent);
    }
  }
}
