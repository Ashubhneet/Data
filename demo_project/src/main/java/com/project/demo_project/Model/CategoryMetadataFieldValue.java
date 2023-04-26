package com.project.demo_project.Model;

import javax.persistence.*;
import java.io.Serializable;

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
