package entities.interfaces

/**
 * Interface that represents a vote for a single competitor.
 */
interface SinglePreferenceVote<S : ScoreMetric> : Vote {
    /**
     * Competitor chosen in the vote.
     */
    var votedCompetitor: Competitor<S>
}
