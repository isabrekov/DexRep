package ru.supalias.configuration;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.supalias.dto.AbilityDTO;
import ru.supalias.entity.Ability;

import java.util.List;

@Mapper
public interface AbilityDTOMapper {
    AbilityDTOMapper INSTANCE = Mappers.getMapper( AbilityDTOMapper.class );
    default Ability abilityDTOToAbility(AbilityDTO abilityDTO){
        if ( abilityDTO == null ) {
            return null;
        }
        Ability ability = new Ability();
        ability.setAbilitiesEffect(AbilitiesEffectDTOMapper.INSTANCE.abilitiesEffectDTOToAbilitiesEffect(abilityDTO.getEffectEntries().get(0)));
        return ability;
    }
    List<Ability> abilityDTOToAbility(List<AbilityDTO> abilityDTOList);
}
