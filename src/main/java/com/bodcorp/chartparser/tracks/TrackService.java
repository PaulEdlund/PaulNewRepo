package com.bodcorp.chartparser.tracks;

import java.util.List;
import java.util.Optional;

/**
 * Gets the {@link Track}s from the {@link TrackRepository}
 */
public class TrackService {

    private TrackRepository repository;

    public TrackService(TrackRepository repository) {
        this.repository = repository;
    }

    public Optional<Track> getTrack(String trackCode) {
        return repository.findByCode(trackCode);
    }

    public Optional<Track> getTrackWithName(String trackName) {
        return repository.findByName(trackName);
    }

    public List<Track> getTracksWithState(String state) {
        return repository.findByState(state);
    }

    public List<Track> getTracks() {
        return repository.findAll();
    }
}
