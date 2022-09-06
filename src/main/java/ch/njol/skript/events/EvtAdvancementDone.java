package ch.njol.skript.events;

import ch.njol.skript.Skript;
import ch.njol.skript.lang.Literal;
import ch.njol.skript.lang.SkriptEvent;
import ch.njol.skript.lang.SkriptParser;
import org.bukkit.event.Event;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;
import org.eclipse.jdt.annotation.Nullable;

public class EvtAdvancementDone extends SkriptEvent {

	static {
		Skript.registerEvent("Advancement Done", EvtAdvancementDone.class, PlayerAdvancementDoneEvent.class,
				"on (advancement|achievement) (done|finished)")
			.description("Called when a player finish an advancement/achievement")
			.examples("on advancement done:")
			.since("INSERT VERSION");
	}

	@Override
	public boolean init(Literal<?>[] args, int matchedPattern, SkriptParser.ParseResult parseResult) {
		return true;
	}

	@Override
	public boolean check(Event e) {
		return (e instanceof PlayerAdvancementDoneEvent);
	}

	@Override
	public String toString(@Nullable Event e, boolean debug) {
		return "advancement done";
	}
}
