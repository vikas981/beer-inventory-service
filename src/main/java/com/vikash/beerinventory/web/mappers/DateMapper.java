package com.vikash.beerinventory.web.mappers;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@Component
public class DateMapper {

    public OffsetDateTime asOffsetDateTime(Timestamp ts){
        return OffsetDateTime.of(ts.toLocalDateTime().getYear(),ts.toLocalDateTime().getMonthValue(),
                ts.toLocalDateTime().getDayOfMonth(),ts.toLocalDateTime().getHour(),
                ts.toLocalDateTime().getMinute(),ts.toLocalDateTime().getSecond(),
                ts.toLocalDateTime().getNano(), ZoneOffset.UTC);
    }

    public Timestamp asTimestamp(OffsetDateTime offsetDateTime){
        return Timestamp.valueOf(offsetDateTime.atZoneSameInstant(ZoneOffset.UTC).toLocalDateTime());
    }

}
