package models

import com.twitter.finatra.validation.Size
import com.twitter.finatra.validation.Range
import org.joda.time.Instant


case class Weight(
                   @Size(min = 1, max = 25) user: String,
                   @Range(min = 25, max = 200) weight: Int,
                   status: Option[String],
                   postedAt: Instant = Instant.now()
                 )
