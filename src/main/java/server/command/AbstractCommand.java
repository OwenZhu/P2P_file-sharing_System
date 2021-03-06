package server.command;

import org.json.simple.JSONObject;

import server.Server;

public abstract class AbstractCommand {

	protected Server server;

	AbstractCommand() {}

	abstract JSONObject parse(JSONObject clientCommand);

	public abstract JSONObject commandRun(JSONObject clientCommand);
}
