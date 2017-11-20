package me.callmefilms.MrYaml;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.craftbukkit.libs.jline.internal.Log;

public class YAMLHandler {
	
	public class RealYAML {
		
		private File file;
		private YamlConfiguration yaml;
		
		public RealYAML(File file) {
			this.file = file;
			if(!file.exists()) {
				try {
					file.createNewFile();
				} catch(IOException e) {
					Log.error(e.getMessage());
				}
			}
			this.yaml = YamlConfiguration.loadConfiguration(file);
		}
		
	}
	
}
