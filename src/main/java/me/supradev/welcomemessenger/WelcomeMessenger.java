/* Licensed under GNU General Public License v3.0 */
package me.supradev.welcomemessenger;

import org.bukkit.plugin.java.JavaPlugin;

public final class WelcomeMessenger extends JavaPlugin {

  public static WelcomeMessenger pluginInstance;

  @Override
  public void onEnable() {
    pluginInstance = this;
    getLogger().info("Registering event...");
    this.getServer().getPluginManager().registerEvents(new OnPlayerJoin(), this);
    getLogger().info("Event registered, WelcomeMessenger is now ready.");
  }

  @Override
  public void onDisable() {
    getLogger().info("WelcomeMessenger is now disabling, cya.");
  }
}
