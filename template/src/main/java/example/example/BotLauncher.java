package example.example;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;

public class BotLauncher {

    public static JDABuilder builder;
    public static void main(String[] args) throws LoginException {
        String token = "your token";
        builder = JDABuilder.createDefault(token);


        //whatever you want can go here
        builder.setActivity(Activity.playing("$help"));

        //remove this if you don't want these intents
        builder.enableIntents(GatewayIntent.GUILD_MEMBERS);
        builder.enableIntents(GatewayIntent.GUILD_VOICE_STATES);
        builder.enableIntents(GatewayIntent.GUILD_MESSAGES);

        //remove this if you don't want it
        builder.enableCache(CacheFlag.VOICE_STATE);



        builder.build();
    }
}
