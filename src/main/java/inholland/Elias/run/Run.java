package inholland.Elias.run;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record Run(
        Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completeOn,
        Integer miles,
        Location location
) {}


