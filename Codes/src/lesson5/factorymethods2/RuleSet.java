package lesson5.factorymethods2;

import java.awt.Component;

import lesson5.factorymethods2.rulesets.RuleException;

public interface RuleSet {
	public void applyRules(Component ob) throws RuleException;
}
