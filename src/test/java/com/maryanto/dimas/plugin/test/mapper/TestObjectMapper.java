package com.maryanto.dimas.plugin.test.mapper;

import com.maryanto.dimas.plugin.test.mapper.mapper.NasabahMapper;
import com.maryanto.dimas.plugin.test.mapper.model.Nasabah;
import com.maryanto.dimas.plugin.test.mapper.model.NasabahDTO;
import junit.framework.TestCase;
import org.junit.Test;

public class TestObjectMapper extends TestCase {

    private NasabahDTO data = new NasabahDTO();


    @Override
    protected void setUp() throws Exception {
//        super.setUp();
        data.setNomorRegister("1234");
    }

    @Test
    public void testNasabahMapper(){
        Nasabah nasabah = NasabahMapper.instance.convertToEntity(data);

        assertNotNull(nasabah.getNomorCif());
        assertEquals("Bandingkan nomor cif", nasabah.getNomorCif(), data.getNomorRegister());
    }

}
