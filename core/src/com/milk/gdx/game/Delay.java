package com.milk.gdx.game;

import com.badlogic.gdx.scenes.scene2d.actions.DelegateAction;

public class Delay extends DelegateAction {
	private float duration, time;

	public Delay () {
	}

	public Delay (float duration) {
		this.duration = duration;
	}
    
	protected boolean delegate (float delta) {
		if (time < duration) {
			time += delta;
			if (time < duration) return false;
			delta = time - duration;
		}
		if (action == null) return true;
		return action.act(delta);
	}
	/** Causes the delay to be complete. */
	public void finish () {
		time = duration;
	}

	/** Gets the time spent waiting for the delay. */
	public float getTime () {
		return time;
	}

	/** Sets the time spent waiting for the delay. */
	public void setTime (float time) {
		this.time = time;
	}

	public float getDuration () {
		return duration;
	}

	/** Sets the length of the delay in seconds. */
	public void setDuration (float duration) {
		this.duration = duration;
	}
}

