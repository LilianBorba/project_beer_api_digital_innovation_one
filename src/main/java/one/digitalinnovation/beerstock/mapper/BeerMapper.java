package com.dio.beerstock.mapper;

import com.dio.beerstock.dto.BeerDTO;
import com.dio.beerstock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring") // Use "spring" para injeção de dependência
public interface BeerMapper {

    // Instância estática para uso em classes que não são beans gerenciados (como o Teste Unitário)
    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
