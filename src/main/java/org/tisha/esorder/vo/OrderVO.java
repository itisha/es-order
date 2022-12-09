package org.tisha.esorder.vo;

import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class OrderVO {
    private UUID id;
    private String details;
}
