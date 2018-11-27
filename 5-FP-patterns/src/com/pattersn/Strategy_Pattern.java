package com.pattersn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Track {

	private String title;
	private int duration;

	public Track(String title, int duration) {
		super();
		this.title = title;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Track [title=" + title + ", duration=" + duration + "]";
	}

	public String getTitle() {
		return title;
	}

	public int getDuration() {
		return duration;
	}

}

interface SchedulingStrategy {
	Track next(List<Track> tracks);
}

class PlayList {

	private List<Track> tracks = new ArrayList<>();
	private SchedulingStrategy schedulingStrategy;

	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}

	public void setSchedulingStrategy(SchedulingStrategy schedulingStrategy) {
		this.schedulingStrategy = schedulingStrategy;
	}

	public Track getNextTrack() {
		return schedulingStrategy.next(tracks);
	}

}

public class Strategy_Pattern {

	public static void main(String[] args) {

		PlayList playList = new PlayList();
		playList.setTracks(Arrays.asList(new Track("la la", 3), new Track("ha ha", 2), new Track("hoo hoo", 4)));

		SchedulingStrategy fcfp = tracks -> tracks.get(0);
		SchedulingStrategy ldfp = tracks -> {
			return tracks.get(1);
		};

		playList.setSchedulingStrategy(ldfp);

		Track track = playList.getNextTrack();
		System.out.println(track);

	}

}
