package mixed_ideas;

import mixed_ideas.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod
(   modid = Reference.MOD_ID,
    name = Reference.MOD_NAME,
    version = Reference.MOD_VERSION)

public class MixedIdeas {
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event){
        
    }

    @Init
    public void init(){
        
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event){
    }
}

