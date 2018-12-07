package com.maryanto.dimas.plugin.test.mapper;

import com.maryanto.dimas.plugin.test.mapper.mapper.NasabahMapper;
import com.maryanto.dimas.plugin.test.mapper.model.Nasabah;
import com.maryanto.dimas.plugin.test.mapper.model.NasabahDTO;
import junit.framework.TestCase;
import org.junit.Test;

public class TestObjectMapper extends TestCase {

    @Override
    protected void setUp() throws Exception {
//        super.setUp();
    }

    @Test
    public void testNasabahMapper() {
        NasabahDTO data = new NasabahDTO();
        data.setNomorRegister("1234");
        Nasabah nasabah = NasabahMapper.instance.convertToEntity(data);

        assertNotNull(nasabah.getNomorCif());
        assertEquals("Bandingkan nomor cif", nasabah.getNomorCif(), data.getNomorRegister());
    }

    @Test
    public void testNasabahDtoMapper(){
        Nasabah nasabah = new Nasabah();
        nasabah.setNomorCif("12345");

        NasabahDTO dto = NasabahMapper.instance.convertToDto(nasabah);
        assertNotNull(dto.getNomorRegister());
        assertEquals("Bandingkan nomor cif", nasabah.getNomorCif(), dto.getNomorRegister());
    }

}
