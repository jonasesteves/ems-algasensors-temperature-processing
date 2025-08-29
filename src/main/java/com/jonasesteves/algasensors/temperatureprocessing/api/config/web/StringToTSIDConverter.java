package com.jonasesteves.algasensors.temperatureprocessing.api.config.web;

import io.hypersistence.tsid.TSID;
import org.springframework.core.convert.converter.Converter;

public class StringToTSIDConverter implements Converter<String, TSID> {
    /* Ao buscar um TSID pelo seu hash, ele precisa ser convertido em TSID para ser buscado no banco. (10.6) */

    @Override
    public TSID convert(String source) {
        return TSID.from(source);
    }
}
