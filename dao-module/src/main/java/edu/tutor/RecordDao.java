package edu.tutor;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import edu.tutor.model.Record;

public class RecordDao implements RecordAccess
{
	private Map<String, Record> map = new HashMap<String, Record>();

	public RecordDao()
	{
		;
	}

	@Override
	public Record getRecord(String label)
	{
		return (map.get(label));
	}

	@Override
	public void putRecord(Record record)
	{
		map.put(record.getLabel(), record);
	}

	@Override
	public Iterator<Record> iterator()
	{
		return (new RecordIterator(map));
	}

	private class RecordIterator implements Iterator<Record>
	{
		private Collection<Record> records;
		private Iterator<Record> iterator;
		
		RecordIterator(Map<String, Record> map)
		{
			records = map.values();
			iterator = records.iterator();
		}

		@Override
		public boolean hasNext()
		{
			return (iterator.hasNext());
		}

		@Override
		public Record next()
		{
			return (iterator.next());
		}

	}

}
