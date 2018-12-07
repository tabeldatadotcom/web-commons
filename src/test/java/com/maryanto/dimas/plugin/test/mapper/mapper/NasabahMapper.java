package com.maryanto.dimas.plugin.test.mapper.mapper;

import com.maryanto.dimas.plugin.test.mapper.model.Nasabah;
import com.maryanto.dimas.plugin.test.mapper.model.NasabahDTO;
import com.maryanto.dimas.plugins.web.commons.mappers.ObjectMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NasabahMapper extends ObjectMapper<Nasabah, NasabahDTO> {

    NasabahMapper instance = Mappers.getMapper(NasabahMapper.class);

    @Override
    @Mappings(value = {
            @Mapping(target = "nomorCif", source = "dto.nomorRegister")
    })
    Nasabah convertToEntity(NasabahDTO dto);

    @Override
    @Mappings(value = {
            @Mapping(source = "entity.nomorCif", target = "nomorRegister")
    })
    NasabahDTO convertToDto(Nasabah entity);
}
