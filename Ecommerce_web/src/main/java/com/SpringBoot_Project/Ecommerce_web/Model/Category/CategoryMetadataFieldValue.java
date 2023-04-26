package com.SpringBoot_Project.Ecommerce_web.Model.Category;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "categoryMetadataFieldValue")
public class CategoryMetadataFieldValue {
    @EmbeddedId
    private CategoryMetadataFieldValueId id = new CategoryMetadataFieldValueId();

    @ManyToOne
    @MapsId("categoryId")
    private Category category;

    @ManyToOne
    @MapsId("categoryMetadataFieldId")
    private CategoryMetadataField categoryMetadataField;

    @Column(nullable = false)
    private String value;
    
    @Embeddable
    public static class CategoryMetadataFieldValueId implements Serializable {
        private static final long serialVersionUID = 1L;
        private Long categoryId;
        private Long categoryMetadataFieldId;

    }
}
