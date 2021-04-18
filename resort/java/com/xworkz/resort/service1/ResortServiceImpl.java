package com.xworkz.resort.service1;

import java.util.List;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dto.ResortDTO;

public class ResortServiceImpl implements ResortService {
	private ResortDAO dao;

	public ResortServiceImpl(ResortDAO dao) {
		this.dao = dao;
	}

	boolean valid = false;

	@Override
	public void validateAndSave(ResortDTO dto) {
		System.out.println("invoked validateAndSave");
		System.out.println("arg1" + dto);

		// boolean valid = false;

		if (dto != null) {
			String tempName = dto.getName();

			if (tempName != null && !tempName.isEmpty() && !tempName.contains(" ") && tempName.length() >= 3) {
				valid = true;
				System.out.println("name is valid,now validating the location...");
				String location = dto.getLocation();

				if (location != null && location.length() >= 3 && !location.contains(" ") && !location.isEmpty()) {
					valid = true;
					for (int i = 0; i < location.length(); i++) {
						int var = (int) location.charAt(i);
						if (var > 96 && var < 123 || var > 64 && var < 91) {
							valid = true;
							continue;
						} else {
							System.out.println("the location can not contain any special characters");
							valid = false;
							break;
						}
					}
					if (valid) {
						System.out.println("the location is valid, now validating the manager name...");
						String managerName = dto.getManagerName();
						if (managerName != null && managerName.length() >= 3 && !managerName.contains(" ")
								&& !managerName.isEmpty()) {
							valid = true;
							System.out.println("the manager Name is valid, now validating the number of Employees..");
							int noOfEmployees = dto.getNoOfEmployees();
							if (noOfEmployees > 0 && noOfEmployees <= 100) {
								valid = true;
								System.out.println(
										"the number of employee s valid, now validating the number of rooms...");
								int noOfRooms = dto.getNoOfRooms();
								if (noOfRooms > 10 && noOfRooms < 101) {
									valid = true;
									System.out
											.println("the number of rooms is valid,now validating the phone number...");

									long phoneNo = dto.getPhoneNo();

									if (phoneNo > 59999999999l && phoneNo < 100000000l) {
										valid = true;

										System.out.println(
												"the phone number is valid, now validating the price per head...");

										double pricePerHead = dto.getPricePerHead();

										if (pricePerHead >= 1000 && pricePerHead < 10001) {
											valid = true;
											System.out.println(
													"the price Per Head id valid,now vaidating the ratings...");

											double rating = dto.getRating();
											if (rating > 0 && rating <= 5) {
												valid = true;
												System.out.println(
														"the ratings are valid, invoking the DAO to save the DTO");
												dao.save(dto);

											} else {
												valid = false;
												System.out.println("the ratings are invalid");
											}
										} else {
											valid = false;
											System.out.println("the price per head is invalid");

										}
									} else {
										valid = false;
										System.out.println("the phone number is invalid");
									}
								} else {
									valid = false;
									System.out.println("the number of rooms is invalid");

								}
							} else {
								valid = false;
								System.out.println("the number of Employees is invalid");

							}
						} else {
							valid = false;
							System.out.println("the manager name is invalid");

						}
					} else {
						valid = false;
						System.out.println("the location is invalid");
					}
				} else {
					valid = false;
					System.out.println("the name is invalid");
				}

			} else {
				System.out.println("dto is null");
			}
		}
	}

	@Override
	public boolean validateAndupdateLocationByName(String location, String name) {
		System.out.println("invoked updateLocationByName");
		if (valid) {
			if (location != null && location.length() >= 3 && !location.isEmpty() && !location.contains(" ")) {
				valid = true;
				System.out.println("location is valid,validating name...");

				if (name != null && !name.isEmpty() && !name.contains(" ") && name.length() >= 3
						&& name.length() <= 15) {
					System.out.println("update the location by given valid name ");
					dao.updateLocationByName(location, name);
					return valid;
				} else {
					valid = false;
					System.out.println("invalid location,can not update");
					return false;
				}
			}
			return false;
		}
		return valid;
	}
	
	

	@Override
	public boolean validateAndupdateLocationByNameandRating(String location, String name, double rating) {
		if (location != null && !location.isEmpty() && !location.contains(" ") && location.length() >= 3
				&& location.length() <= 15) {
			valid = true;
			System.out.println("location is valid,validating name..");
			if (name != null && name.length() >= 3 && !name.isEmpty() && !name.contains(" ")) {
				valid = true;
				System.out.println("the name is also valid, validating ratings... ");
				if (rating > 0 && rating < 5) {
					System.out.println("the rating is also valid,invoking LocationByNameandRating DAO...");
					dao.updateLocationByNameandRating(location, name, rating);
					valid = true;
					return valid;
				} else {
					System.out.println("invalid rating, can not update");
					valid = false;
					return valid;
				}
			} else {
				valid = false;
				System.out.println("the name is not valid, can not update");
				return valid;
			}
		} else {
			valid = false;
			System.out.println("the location is not valid, can not update");
			return false;
		}
	}

	@Override
	public boolean validateAnddeleteByNameAndLocation(String name, String location) {
		// System.out.println(" invoked deleteByNameAndLocation");

		if (name != null && !name.isEmpty() && !name.contains(" ") && name.length() >= 3 && name.length() <= 15) {
			valid = true;
			System.out.println("location is valid,validating name..." + name);
			if (location != null && !location.isEmpty() && !location.contains(" ") && location.length() >= 3
					&& location.length() <= 15) {
				valid = true;
				System.out.println(("name is also valid,invoking deleteByNameAndLocation DAO"));
			} else {
				System.out.println("the name is invalid,cannot delete");
				valid = false;
				return valid;
			}
		} else {
			System.out.println("the location is not valid, cant not delete");
			return false;
		}
		return false;

	}

	@Override
	public boolean validateAndaddMultipleResorts(List<ResortDTO> dtos) {
		if (dtos != null) {
			if (dtos.size() != 0) {
				System.out.println("data is valid,trying to add....");
				for (ResortDTO resortDTO : dtos) {
					validateAndSave(resortDTO);
				}
				System.out.println("Added the multiple dtos passed");
				return true;
			} else {
				System.out.println("can not add an empty list");
				return false;
			}
		} else {
			System.out.println("cannot add null");
			return false;
		}
	}

	@Override
	public int validateAndtotalResortSize() {
		return dao.totalResortSize();
	}

	@Override
	public List<ResortDTO> getAll() {
		return dao.getAll();
	}

}
