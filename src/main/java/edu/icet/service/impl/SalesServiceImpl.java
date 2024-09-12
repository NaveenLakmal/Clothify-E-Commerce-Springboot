package edu.icet.service.impl;

import edu.icet.dto.SalesDto;
import edu.icet.service.SalesService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesServiceImpl implements SalesService {
    @Override
    public boolean addSales(SalesDto salesDto) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public List<SalesDto> getAll() {
        return null;
    }

    @Override
    public SalesDto findOne(long id) {
        return null;
    }

    @Override
    public boolean updateSalesById(long id, SalesDto salesDto) {
        return false;
    }
}
