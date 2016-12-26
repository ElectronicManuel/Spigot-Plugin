package me.reverser.PLUGINNAME.main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	private static Main instance;
	public static Main getInstance() { return instance; }

	public void onEnable() {
		instance = this;
		saveDefaultConfig();
		//getServer().getPluginManager().registerEvents(new Listener(), this);
		//getCommand("cmd").setExecutor(new WarnExecutor());
		System.out.println(getDescription().getName() + " v" + getDescription().getVersion() + " enabled!");
	}
	
	public void onDisable() {
		System.out.println(getDescription().getName() + " v" + getDescription().getVersion() + " disabled!");
	}
	
	
	//Add this to the POM
	/*
	 
	  <build>
		<finalName>${project.artifactId}</finalName>
		<sourceDirectory>src/main/java</sourceDirectory>
		<resources>
			<resource>
				<targetPath>.</targetPath>
				<filtering>true</filtering>
				<directory>${basedir}/src/main/resources/</directory>
				<includes>
					<include>plugin.yml</include>
					<include>config.yml</include>
				</includes>
			</resource>
		</resources>
		<plugins>

			<plugin>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>2.3.2</version>
			</plugin>

		</plugins>
	</build>
	  
	 
	 */
}
