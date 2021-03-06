//Keith Geneva
package com.cscloi.card_db.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Deck {
    private String deck_id;
    private String user_id;
    private String deck_name;

    public boolean isValid() {
        if ((getDeck_id() == null || getDeck_id().isEmpty())) {
            return false;
        }
        if ((getDeck_name() == null) || (getDeck_name().isEmpty())) {
            return false;
        }
        if (user_id == null) {
            return false;
        }
        return true;
    }
}
