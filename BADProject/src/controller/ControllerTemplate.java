package controller;

import util.Connect;
import util.ReusableMethod;

public abstract class ControllerTemplate {
	protected ReusableMethod rm = new ReusableMethod();
	protected Connect connect = Connect.getInstance();
}
