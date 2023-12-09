package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Data//Getter,Setter,ToString
@NoArgsConstructor//bos constructor
@AllArgsConstructor//dolu constructor
@RequiredArgsConstructor//Nonnull yazdığım alanlardan constructor oluşturur. diğer alanları almaz.
@Entity
//@Table(name = "category")

public class Category {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@Column(unique = true, //benzersiz olsun mu?
        //name = "category_adi", )//sütun adı değiştirme
        length = 50, //uzunluk
        nullable = false, //false ise boş geçilemez
        updatable = true //false yaparsanız güncelleme yapamazsınız.
)
private String namee;
@NonNull
private String serial;
}

