package ru.supalias.configuration;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.supalias.dto.AbilitiesEffectDTO;
import ru.supalias.entity.AbilitiesEffect;

@Mapper
public interface AbilitiesEffectDTOMapper {
    AbilitiesEffectDTOMapper INSTANCE = Mappers.getMapper( AbilitiesEffectDTOMapper.class );
    AbilitiesEffect abilitiesEffectDTOToAbilitiesEffect(AbilitiesEffectDTO abilitiesEffectDTO);
}
