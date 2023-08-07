package com.lcwd.hotel.entities;

import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="hotels")
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {
	
	@Id
	private String id;
	private String name;
	private String location;
	private String about;
}
